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

public val Icons.Bold.ShieldInterrogation: ImageVector
    get() {
        if (_shieldInterrogation != null) {
            return _shieldInterrogation!!
        }
        _shieldInterrogation = Builder(name = "ShieldInterrogation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.957f, 23.556f)
                curveToRelative(2.121f, -0.856f, 9.043f, -4.211f, 9.043f, -11.581f)
                verticalLineToRelative(-6.162f)
                arcToRelative(3.382f, 3.382f, 0.0f, false, false, -2.321f, -3.213f)
                lineToRelative(-7.679f, -2.545f)
                lineToRelative(-7.679f, 2.545f)
                arcToRelative(3.382f, 3.382f, 0.0f, false, false, -2.321f, 3.213f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 6.515f, 6.851f, 10.449f, 8.953f, 11.5f)
                lineToRelative(0.983f, 0.489f)
                close()
                moveTo(18.734f, 5.448f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, 0.266f, 0.365f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 5.26f, -5.034f, 7.9f, -6.932f, 8.7f)
                curveToRelative(-1.926f, -1.0f, -7.068f, -4.1f, -7.068f, -8.7f)
                verticalLineToRelative(-6.162f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, 0.266f, -0.365f)
                lineToRelative(6.734f, -2.233f)
                close()
                moveTo(13.679f, 12.631f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.127f, -6.794f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, false, -1.552f, 3.163f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.389f, -0.792f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, 0.9f, -0.17f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, true, 0.671f, 0.672f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.543f, 1.2f)
                arcToRelative(3.415f, 3.415f, 0.0f, false, false, -1.919f, 3.12f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.452f, 0.452f, 0.0f, false, true, 0.181f, -0.399f)
                close()
            }
        }
        .build()
        return _shieldInterrogation!!
    }

private var _shieldInterrogation: ImageVector? = null
