package me.localx.icons.straight.bold

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

public val Icons.Bold.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.5f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-0.524f)
                lineTo(3.0f, 23.476f)
                arcTo(6.507f, 6.507f, 0.0f, false, true, 9.5f, 17.0f)
                horizontalLineToRelative(3.331f)
                verticalLineToRelative(5.789f)
                lineToRelative(10.147f, -8.814f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, 0.0f, -4.95f)
                lineTo(22.9f, 8.953f)
                lineTo(12.831f, 0.211f)
                lineTo(12.831f, 6.0f)
                lineTo(9.5f, 6.0f)
                arcTo(9.511f, 9.511f, 0.0f, false, false, 0.0f, 15.5f)
                close()
                moveTo(3.0f, 16.578f)
                lineTo(3.0f, 15.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 9.5f, 9.0f)
                horizontalLineToRelative(6.331f)
                lineTo(15.831f, 6.789f)
                lineToRelative(5.049f, 4.383f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.656f)
                lineToRelative(-5.049f, 4.383f)
                lineTo(15.831f, 14.0f)
                lineTo(9.5f, 14.0f)
                arcTo(9.466f, 9.466f, 0.0f, false, false, 3.0f, 16.578f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
