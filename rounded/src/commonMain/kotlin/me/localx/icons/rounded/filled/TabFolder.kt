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
                moveToRelative(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 2.794f, 1.794f, 1.0f, 4.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.379f, 0.0f, 0.725f, 0.214f, 0.895f, 0.553f)
                lineToRelative(1.224f, 2.447f)
                horizontalLineToRelative(2.042f)
                lineToRelative(-1.002f, -2.025f)
                curveToRelative(-0.222f, -0.449f, 0.105f, -0.975f, 0.605f, -0.975f)
                horizontalLineToRelative(1.775f)
                curveToRelative(0.861f, 0.0f, 1.625f, 0.551f, 1.897f, 1.368f)
                lineToRelative(0.807f, 1.632f)
                horizontalLineToRelative(2.064f)
                lineToRelative(-1.002f, -2.025f)
                curveToRelative(-0.222f, -0.449f, 0.105f, -0.975f, 0.605f, -0.975f)
                horizontalLineToRelative(1.782f)
                curveToRelative(0.861f, 0.0f, 1.625f, 0.551f, 1.897f, 1.368f)
                lineToRelative(0.883f, 1.68f)
                curveToRelative(1.981f, 0.238f, 3.526f, 1.908f, 3.526f, 3.952f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(0.0f, 10.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                lineTo(0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _tabFolder!!
    }

private var _tabFolder: ImageVector? = null
