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

public val Icons.Bold.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.436f, 5.089f)
                curveToRelative(-0.068f, -0.236f, -0.187f, -0.449f, -0.352f, -0.622f)
                curveToRelative(-0.986f, -1.485f, -2.672f, -2.467f, -4.584f, -2.467f)
                lineTo(5.5f, 2.0f)
                curveToRelative(-1.912f, 0.0f, -3.598f, 0.982f, -4.584f, 2.467f)
                curveToRelative(-0.165f, 0.173f, -0.284f, 0.386f, -0.352f, 0.622f)
                curveToRelative(-0.358f, 0.729f, -0.564f, 1.545f, -0.564f, 2.411f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -0.865f, -0.206f, -1.682f, -0.564f, -2.411f)
                close()
                moveTo(3.0f, 7.5f)
                curveToRelative(0.0f, -0.171f, 0.018f, -0.338f, 0.051f, -0.5f)
                horizontalLineToRelative(7.449f)
                verticalLineToRelative(4.5f)
                lineTo(3.0f, 11.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.5f, 7.0f)
                horizontalLineToRelative(7.449f)
                curveToRelative(0.033f, 0.162f, 0.051f, 0.329f, 0.051f, 0.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3.0f, 16.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null
