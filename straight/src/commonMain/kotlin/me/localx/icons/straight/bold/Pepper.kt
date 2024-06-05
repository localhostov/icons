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

public val Icons.Bold.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.221f, 4.96f)
                curveTo(18.454f, 1.694f, 16.216f, 0.0f, 14.0f, 0.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.7f, 0.0f, 1.575f, 0.647f, 2.083f, 2.0f)
                arcToRelative(6.282f, 6.282f, 0.0f, false, false, -4.629f, 6.048f)
                curveTo(11.454f, 13.075f, 9.4f, 14.0f, 7.5f, 14.0f)
                curveToRelative(-2.185f, 0.0f, -3.542f, -0.609f, -4.018f, -3.727f)
                lineTo(3.288f, 9.0f)
                horizontalLineTo(0.791f)
                lineTo(0.437f, 10.0f)
                arcTo(8.374f, 8.374f, 0.0f, false, false, 0.0f, 12.5f)
                curveTo(0.0f, 18.948f, 5.271f, 24.0f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                verticalLineToRelative(-0.954f)
                arcTo(6.278f, 6.278f, 0.0f, false, false, 19.221f, 4.96f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                arcToRelative(8.848f, 8.848f, 0.0f, false, true, -8.156f, -4.782f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 7.5f, 17.0f)
                curveToRelative(4.029f, 0.0f, 6.954f, -2.5f, 6.954f, -5.954f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 0.334f, -1.413f)
                arcTo(4.471f, 4.471f, 0.0f, false, false, 18.0f, 11.0f)
                arcToRelative(4.423f, 4.423f, 0.0f, false, false, 2.811f, -1.008f)
                arcTo(3.236f, 3.236f, 0.0f, false, true, 21.0f, 11.046f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
