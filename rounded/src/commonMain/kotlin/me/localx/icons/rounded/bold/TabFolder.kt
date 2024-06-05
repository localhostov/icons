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

public val Icons.Bold.TabFolder: ImageVector
    get() {
        if (_tabFolder != null) {
            return _tabFolder!!
        }
        _tabFolder = Builder(name = "TabFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.803f, 3.163f)
                lineToRelative(-0.213f, -0.795f)
                curveToRelative(-0.272f, -0.817f, -1.037f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-2.648f)
                lineToRelative(0.667f, 2.0f)
                horizontalLineToRelative(-2.064f)
                lineToRelative(-0.211f, -0.632f)
                curveToRelative(-0.272f, -0.817f, -1.037f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-2.642f)
                lineToRelative(0.667f, 2.0f)
                horizontalLineToRelative(-2.079f)
                lineToRelative(-0.211f, -0.632f)
                curveToRelative(-0.272f, -0.817f, -1.036f, -1.368f, -1.897f, -1.368f)
                horizontalLineToRelative(-1.376f)
                curveTo(1.791f, 1.0f, 0.0f, 2.791f, 0.0f, 5.0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -2.583f, -1.792f, -4.75f, -4.197f, -5.337f)
                close()
                moveTo(21.0f, 17.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 20.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(17.949f)
                curveToRelative(0.033f, 0.162f, 0.051f, 0.329f, 0.051f, 0.5f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _tabFolder!!
    }

private var _tabFolder: ImageVector? = null
