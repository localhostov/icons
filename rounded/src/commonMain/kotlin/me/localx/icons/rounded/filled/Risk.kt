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

public val Icons.Filled.Risk: ImageVector
    get() {
        if (_risk != null) {
            return _risk!!
        }
        _risk = Builder(name = "Risk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.46f, 17.882f)
                curveToRelative(-0.811f, 1.44f, -2.645f, 1.954f, -4.085f, 1.145f)
                lineToRelative(-0.574f, -0.323f)
                curveToRelative(-0.823f, 0.73f, -1.773f, 1.303f, -2.801f, 1.688f)
                verticalLineToRelative(0.608f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-1.094f, -0.364f, -2.107f, -0.938f, -2.988f, -1.691f)
                lineToRelative(-0.387f, 0.218f)
                curveToRelative(-1.443f, 0.808f, -3.275f, 0.295f, -4.085f, -1.145f)
                curveToRelative(-0.811f, -1.442f, -0.297f, -3.275f, 1.145f, -4.086f)
                lineToRelative(0.329f, -0.185f)
                curveToRelative(-0.099f, -0.536f, -0.148f, -1.082f, -0.148f, -1.631f)
                curveToRelative(0.0f, -0.536f, 0.048f, -1.07f, 0.142f, -1.596f)
                lineToRelative(-0.323f, -0.181f)
                curveToRelative(-1.441f, -0.811f, -1.955f, -2.644f, -1.145f, -4.086f)
                curveToRelative(0.393f, -0.698f, 1.034f, -1.202f, 1.806f, -1.418f)
                curveToRelative(0.771f, -0.217f, 1.582f, -0.12f, 2.28f, 0.274f)
                lineToRelative(0.359f, 0.202f)
                curveToRelative(0.886f, -0.765f, 1.909f, -1.347f, 3.015f, -1.716f)
                verticalLineToRelative(-0.461f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(0.57f)
                curveToRelative(1.039f, 0.39f, 1.997f, 0.97f, 2.827f, 1.711f)
                lineToRelative(0.548f, -0.308f)
                curveToRelative(0.697f, -0.394f, 1.507f, -0.493f, 2.279f, -0.273f)
                curveToRelative(0.771f, 0.216f, 1.413f, 0.72f, 1.806f, 1.418f)
                curveToRelative(0.811f, 1.442f, 0.297f, 3.275f, -1.145f, 4.086f)
                lineToRelative(-0.603f, 0.339f)
                curveToRelative(0.077f, 0.475f, 0.115f, 0.955f, 0.115f, 1.438f)
                curveToRelative(0.0f, 0.495f, -0.041f, 0.988f, -0.121f, 1.474f)
                lineToRelative(0.608f, 0.342f)
                curveToRelative(1.442f, 0.811f, 1.956f, 2.644f, 1.145f, 4.086f)
                close()
                moveTo(17.404f, 13.87f)
                lineToRelative(-4.181f, -7.167f)
                curveToRelative(-0.547f, -0.937f, -1.9f, -0.937f, -2.447f, 0.0f)
                lineToRelative(-4.181f, 7.167f)
                curveToRelative(-0.551f, 0.944f, 0.13f, 2.13f, 1.224f, 2.13f)
                horizontalLineToRelative(8.361f)
                curveToRelative(1.093f, 0.0f, 1.774f, -1.186f, 1.224f, -2.13f)
                close()
            }
        }
        .build()
        return _risk!!
    }

private var _risk: ImageVector? = null
