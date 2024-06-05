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

public val Icons.Filled.TabFolder: ImageVector
    get() {
        if (_tabFolder != null) {
            return _tabFolder!!
        }
        _tabFolder = Builder(name = "TabFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 10.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(13.0f)
                lineTo(0.0f, 23.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-0.821f)
                lineToRelative(-0.589f, -1.632f)
                curveToRelative(-0.272f, -0.817f, -1.037f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-2.648f)
                lineToRelative(1.051f, 3.0f)
                horizontalLineToRelative(-2.071f)
                lineToRelative(-0.589f, -1.632f)
                curveToRelative(-0.272f, -0.817f, -1.036f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-2.642f)
                lineToRelative(1.051f, 3.0f)
                horizontalLineToRelative(-2.071f)
                lineToRelative(-1.061f, -3.0f)
                horizontalLineToRelative(-3.816f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _tabFolder!!
    }

private var _tabFolder: ImageVector? = null
