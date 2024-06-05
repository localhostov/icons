package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.TablePicnic: ImageVector
    get() {
        if (_tablePicnic != null) {
            return _tablePicnic!!
        }
        _tablePicnic = Builder(name = "TablePicnic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.876f, 18.903f)
                lineToRelative(-1.691f, -3.903f)
                horizontalLineToRelative(0.315f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.615f)
                lineToRelative(-2.6f, -6.0f)
                horizontalLineToRelative(1.215f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.215f)
                lineToRelative(-2.6f, 6.0f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.315f)
                lineTo(0.124f, 18.903f)
                curveToRelative(-0.33f, 0.761f, 0.02f, 1.644f, 0.779f, 1.973f)
                curveToRelative(0.194f, 0.085f, 0.396f, 0.124f, 0.596f, 0.124f)
                curveToRelative(0.58f, 0.0f, 1.132f, -0.338f, 1.377f, -0.903f)
                lineToRelative(2.209f, -5.097f)
                horizontalLineToRelative(13.831f)
                lineToRelative(2.209f, 5.097f)
                curveToRelative(0.245f, 0.565f, 0.797f, 0.903f, 1.377f, 0.903f)
                curveToRelative(0.199f, 0.0f, 0.401f, -0.039f, 0.596f, -0.124f)
                curveToRelative(0.76f, -0.329f, 1.109f, -1.212f, 0.779f, -1.973f)
                close()
                moveTo(6.385f, 12.0f)
                lineToRelative(2.6f, -6.0f)
                horizontalLineToRelative(6.031f)
                lineToRelative(2.6f, 6.0f)
                horizontalLineTo(6.385f)
                close()
            }
        }
        .build()
        return _tablePicnic!!
    }

private var _tablePicnic: ImageVector? = null
