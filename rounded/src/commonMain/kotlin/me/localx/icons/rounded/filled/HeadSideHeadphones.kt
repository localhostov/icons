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

public val Icons.Filled.HeadSideHeadphones: ImageVector
    get() {
        if (_headSideHeadphones != null) {
            return _headSideHeadphones!!
        }
        _headSideHeadphones = Builder(name = "HeadSideHeadphones", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(19.801f, 4.419f)
                curveTo(17.882f, 1.858f, 15.075f, 0.313f, 12.0f, 0.042f)
                verticalLineToRelative(7.085f)
                curveToRelative(1.724f, 0.445f, 3.0f, 2.013f, 3.0f, 3.874f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.861f, 1.276f, -3.429f, 3.0f, -3.874f)
                lineTo(10.0f, 0.044f)
                curveToRelative(-0.182f, 0.016f, -0.364f, 0.037f, -0.547f, 0.062f)
                curveTo(4.457f, 0.793f, 0.501f, 4.946f, 0.046f, 9.982f)
                curveToRelative(-0.25f, 2.77f, 0.536f, 5.501f, 2.215f, 7.691f)
                curveToRelative(0.477f, 0.624f, 0.739f, 1.46f, 0.739f, 2.355f)
                verticalLineToRelative(0.971f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(0.494f)
                curveToRelative(2.498f, 0.0f, 4.629f, -1.867f, 4.957f, -4.345f)
                lineToRelative(0.219f, -1.655f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.299f, 0.0f, 2.0f, -1.03f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.42f, -2.932f, -7.014f, -4.199f, -8.581f)
                close()
            }
        }
        .build()
        return _headSideHeadphones!!
    }

private var _headSideHeadphones: ImageVector? = null
