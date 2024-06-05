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
                moveTo(18.535f, 20.518f)
                curveToRelative(-0.308f, 0.309f, -0.727f, 0.482f, -1.173f, 0.482f)
                reflectiveCurveToRelative(-0.864f, -0.174f, -1.179f, -0.489f)
                lineToRelative(-1.845f, -1.788f)
                lineToRelative(1.393f, -1.436f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.228f, -3.175f)
                lineToRelative(1.402f, 1.426f)
                lineToRelative(-3.456f, 3.399f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -2.39f, 1.048f, -4.534f, 2.709f, -6.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.071f)
                curveToRelative(1.177f, -0.681f, 2.543f, -1.071f, 4.0f, -1.071f)
                lineTo(18.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(12.709f)
                curveToRelative(-1.661f, -1.466f, -2.709f, -3.61f, -2.709f, -6.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _memoCircleCheck!!
    }

private var _memoCircleCheck: ImageVector? = null
