package me.localx.icons.rounded.filled

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

public val Icons.Filled.MemoCircleCheck: ImageVector
    get() {
        if (_memoCircleCheck != null) {
            return _memoCircleCheck!!
        }
        _memoCircleCheck = Builder(name = "MemoCircleCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.192f, 18.202f)
                lineToRelative(-2.213f, 2.124f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.132f, -1.109f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.396f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.131f, 1.108f)
                curveToRelative(0.144f, 0.142f, 0.379f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.223f, -2.134f)
                curveToRelative(0.397f, -0.382f, 1.031f, -0.371f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -2.39f, 1.048f, -4.534f, 2.709f, -6.0f)
                horizontalLineToRelative(-7.709f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.024f, -0.001f, 0.048f, -0.003f, 0.072f)
                curveToRelative(1.177f, -0.682f, 2.544f, -1.072f, 4.003f, -1.072f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.709f)
                curveToRelative(-1.661f, -1.466f, -2.709f, -3.61f, -2.709f, -6.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _memoCircleCheck!!
    }

private var _memoCircleCheck: ImageVector? = null
