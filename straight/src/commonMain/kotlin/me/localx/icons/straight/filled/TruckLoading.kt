package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) {
            return _truckLoading!!
        }
        _truckLoading = Builder(name = "TruckLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 17.0f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, false, -0.526f, 0.053f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineTo(16.271f)
                lineToRelative(-2.721f, 0.876f)
                lineToRelative(-2.814f, -8.84f)
                lineTo(0.064f, 12.244f)
                lineToRelative(2.7f, 8.922f)
                lineToRelative(-2.741f, 0.882f)
                lineToRelative(0.614f, 1.9f)
                lineToRelative(17.016f, -5.478f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                close()
                moveTo(5.836f, 15.056f)
                lineTo(5.23f, 13.15f)
                lineToRelative(3.467f, -1.1f)
                lineTo(9.3f, 13.953f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
