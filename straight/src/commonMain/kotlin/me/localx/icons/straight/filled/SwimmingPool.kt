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

public val Icons.Filled.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) {
            return _swimmingPool!!
        }
        _swimmingPool = Builder(name = "SwimmingPool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 15.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 4.0f)
                curveToRelative(0.0f, -1.098f, 0.894f, -1.996f, 1.992f, -2.0f)
                lineToRelative(1.027f, -0.004f)
                lineToRelative(-0.009f, -2.0f)
                lineToRelative(-1.026f, 0.004f)
                curveToRelative(-2.197f, 0.009f, -3.983f, 1.804f, -3.983f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.098f, 0.894f, -1.996f, 1.992f, -2.0f)
                lineToRelative(1.027f, -0.004f)
                lineToRelative(-0.009f, -2.0f)
                lineToRelative(-1.026f, 0.004f)
                curveToRelative(-2.197f, 0.009f, -3.983f, 1.804f, -3.983f, 4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 9.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(24.009f, 22.632f)
                curveToRelative(-0.76f, 0.869f, -1.856f, 1.368f, -3.009f, 1.368f)
                curveToRelative(-1.194f, 0.0f, -2.266f, -0.526f, -3.0f, -1.357f)
                curveToRelative(-0.734f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                reflectiveCurveToRelative(-2.266f, -0.526f, -3.0f, -1.357f)
                curveToRelative(-0.734f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                reflectiveCurveToRelative(-2.266f, -0.526f, -3.0f, -1.357f)
                curveToRelative(-0.734f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                curveToRelative(-1.152f, 0.0f, -2.249f, -0.499f, -3.009f, -1.368f)
                lineToRelative(1.506f, -1.316f)
                curveToRelative(0.38f, 0.435f, 0.928f, 0.684f, 1.503f, 0.684f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.575f, 0.0f, 1.123f, -0.25f, 1.503f, -0.684f)
                lineToRelative(1.506f, 1.316f)
                close()
            }
        }
        .build()
        return _swimmingPool!!
    }

private var _swimmingPool: ImageVector? = null
