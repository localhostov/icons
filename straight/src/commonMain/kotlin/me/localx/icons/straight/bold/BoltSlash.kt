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

public val Icons.Bold.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.795f, 15.674f)
                lineToRelative(2.219f, -3.074f)
                curveToRelative(0.605f, -0.91f, 0.659f, -2.074f, 0.143f, -3.038f)
                curveToRelative(-0.517f, -0.963f, -1.517f, -1.562f, -2.61f, -1.562f)
                horizontalLineToRelative(-3.158f)
                lineTo(16.411f, 0.0f)
                horizontalLineToRelative(-4.193f)
                lineToRelative(-4.236f, 5.861f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.801f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-6.166f, -6.166f)
                close()
                moveTo(17.471f, 11.0f)
                lineToRelative(-1.825f, 2.525f)
                lineToRelative(-2.525f, -2.525f)
                horizontalLineToRelative(4.35f)
                close()
                moveTo(14.829f, 19.778f)
                lineToRelative(-3.052f, 4.222f)
                horizontalLineToRelative(-4.193f)
                lineToRelative(2.023f, -8.0f)
                horizontalLineToRelative(-3.132f)
                curveToRelative(-1.102f, 0.0f, -2.109f, -0.604f, -2.632f, -1.577f)
                curveToRelative(-0.516f, -0.96f, -0.463f, -2.118f, 0.137f, -3.022f)
                lineToRelative(1.036f, -1.435f)
                lineToRelative(9.812f, 9.812f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
