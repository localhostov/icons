package me.localx.icons.straight.bold

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

public val Icons.Bold.TabletAndroidAlt: ImageVector
    get() {
        if (_tabletAndroidAlt != null) {
            return _tabletAndroidAlt!!
        }
        _tabletAndroidAlt = Builder(name = "TabletAndroidAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _tabletAndroidAlt!!
    }

private var _tabletAndroidAlt: ImageVector? = null
