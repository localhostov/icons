package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1797f, 16.3206f)
                lineToRelative(2.1213f, -2.1213f)
                lineToRelative(2.5003f, 2.5003f)
                lineToRelative(-2.1213f, 2.1213f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.379f, 0.621f)
                arcToRelative(2.122f, 2.122f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(18.0f, 3.0f)
                verticalLineToRelative(0.956f)
                lineTo(15.833f, 6.092f)
                arcToRelative(6.068f, 6.068f, 0.0f, false, false, -7.614f, 0.538f)
                arcToRelative(5.718f, 5.718f, 0.0f, false, false, -0.995f, 1.364f)
                arcTo(6.952f, 6.952f, 0.0f, false, false, 2.106f, 9.93f)
                curveToRelative(-3.0f, 3.0f, -2.756f, 8.125f, 0.541f, 11.423f)
                arcToRelative(8.837f, 8.837f, 0.0f, false, false, 6.208f, 2.641f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, 5.215f, -2.1f)
                arcToRelative(6.958f, 6.958f, 0.0f, false, false, 1.936f, -5.128f)
                arcToRelative(5.312f, 5.312f, 0.0f, false, false, 1.364f, -0.985f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, 0.573f, -7.557f)
                lineTo(20.2f, 6.0f)
                horizontalLineTo(21.0f)
                lineToRelative(2.379f, -2.379f)
                arcToRelative(2.122f, 2.122f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(15.249f, 13.66f)
                arcToRelative(2.375f, 2.375f, 0.0f, false, true, -0.619f, 0.44f)
                arcTo(2.684f, 2.684f, 0.0f, false, false, 13.0f, 16.5f)
                arcToRelative(4.229f, 4.229f, 0.0f, false, true, -1.052f, 3.273f)
                curveToRelative(-1.831f, 1.83f, -5.053f, 1.587f, -7.18f, -0.541f)
                reflectiveCurveToRelative(-2.372f, -5.349f, -0.541f, -7.18f)
                arcToRelative(4.091f, 4.091f, 0.0f, false, true, 3.011f, -1.057f)
                curveToRelative(0.087f, 0.0f, 0.174f, 0.0f, 0.263f, 0.005f)
                arcTo(2.694f, 2.694f, 0.0f, false, false, 9.9f, 9.372f)
                arcToRelative(2.379f, 2.379f, 0.0f, false, true, 0.441f, -0.621f)
                arcToRelative(2.935f, 2.935f, 0.0f, false, true, 3.26f, -0.458f)
                lineTo(12.575f, 9.3f)
                lineToRelative(2.106f, 2.136f)
                lineToRelative(1.034f, -1.02f)
                arcTo(2.927f, 2.927f, 0.0f, false, true, 15.249f, 13.66f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
