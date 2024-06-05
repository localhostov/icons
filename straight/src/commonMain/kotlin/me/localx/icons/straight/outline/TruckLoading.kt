package me.localx.icons.straight.outline

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

public val Icons.Outline.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) {
            return _truckLoading!!
        }
        _truckLoading = Builder(name = "TruckLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.974f, 2.0f)
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
                lineToRelative(15.467f, -4.979f)
                arcTo(4.018f, 4.018f, 0.0f, false, false, 19.974f, 24.0f)
                curveToRelative(5.274f, -0.138f, 5.273f, -7.863f, 0.0f, -8.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.974f, 2.0f)
                close()
                moveTo(2.551f, 13.551f)
                lineToRelative(8.59f, -2.732f)
                lineToRelative(2.207f, 6.941f)
                lineTo(4.672f, 20.553f)
                close()
                moveTo(21.974f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.974f, 20.0f)
                close()
                moveTo(9.088f, 13.265f)
                lineToRelative(0.605f, 1.906f)
                lineToRelative(-3.466f, 1.1f)
                lineToRelative(-0.606f, -1.906f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
