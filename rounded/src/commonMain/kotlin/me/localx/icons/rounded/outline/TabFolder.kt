package me.localx.icons.rounded.outline

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

public val Icons.Outline.TabFolder: ImageVector
    get() {
        if (_tabFolder != null) {
            return _tabFolder!!
        }
        _tabFolder = Builder(name = "TabFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.951f, 3.096f)
                lineToRelative(-0.36f, -0.729f)
                curveToRelative(-0.272f, -0.817f, -1.037f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-1.782f)
                curveToRelative(-0.501f, 0.0f, -0.828f, 0.526f, -0.605f, 0.975f)
                lineToRelative(0.507f, 1.025f)
                horizontalLineToRelative(-2.064f)
                lineToRelative(-0.313f, -0.632f)
                curveToRelative(-0.272f, -0.817f, -1.036f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-1.775f)
                curveToRelative(-0.501f, 0.0f, -0.828f, 0.526f, -0.605f, 0.975f)
                lineToRelative(0.507f, 1.025f)
                horizontalLineToRelative(-2.047f)
                lineToRelative(-0.724f, -1.447f)
                curveToRelative(-0.169f, -0.339f, -0.516f, -0.553f, -0.895f, -0.553f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.794f, 1.0f, 0.0f, 2.794f, 0.0f, 5.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -2.431f, -1.746f, -4.458f, -4.049f, -4.904f)
                close()
                moveTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.382f)
                lineToRelative(0.724f, 1.447f)
                curveToRelative(0.169f, 0.339f, 0.516f, 0.553f, 0.895f, 0.553f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _tabFolder!!
    }

private var _tabFolder: ImageVector? = null
