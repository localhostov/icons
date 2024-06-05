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

public val Icons.Outline.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.945f)
                curveToRelative(-0.521f, 4.667f, -4.662f, 7.56f, -8.945f, 7.953f)
                verticalLineToRelative(-7.953f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.127f)
                curveToRelative(1.724f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, 1.277f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(4.127f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.953f)
                curveToRelative(-4.283f, -0.393f, -8.424f, -3.286f, -8.945f, -7.953f)
                horizontalLineToRelative(2.945f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 6.885f, 6.102f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(12.0f, -4.115f, 12.0f, -11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
