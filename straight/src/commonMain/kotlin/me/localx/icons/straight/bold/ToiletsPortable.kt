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

public val Icons.Bold.ToiletsPortable: ImageVector
    get() {
        if (_toiletsPortable != null) {
            return _toiletsPortable!!
        }
        _toiletsPortable = Builder(name = "ToiletsPortable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.496f, 2.379f)
                curveToRelative(-0.108f, -0.097f, -2.717f, -2.379f, -6.246f, -2.379f)
                curveToRelative(-2.276f, 0.0f, -4.163f, 0.947f, -5.25f, 1.647f)
                curveToRelative(-1.087f, -0.7f, -2.974f, -1.647f, -5.25f, -1.647f)
                curveTo(3.221f, 0.0f, 0.612f, 2.282f, 0.504f, 2.379f)
                lineToRelative(-0.504f, 0.447f)
                verticalLineToRelative(21.174f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 2.826f)
                lineToRelative(-0.504f, -0.447f)
                close()
                moveTo(21.0f, 4.249f)
                verticalLineToRelative(0.751f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-0.748f)
                curveToRelative(0.708f, -0.478f, 2.101f, -1.252f, 3.75f, -1.252f)
                curveToRelative(1.636f, 0.0f, 3.037f, 0.77f, 3.75f, 1.249f)
                close()
                moveTo(6.75f, 3.0f)
                curveToRelative(1.636f, 0.0f, 3.037f, 0.77f, 3.75f, 1.249f)
                verticalLineToRelative(0.751f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(-0.752f)
                curveToRelative(0.713f, -0.479f, 2.113f, -1.248f, 3.75f, -1.248f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(13.5f, 19.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _toiletsPortable!!
    }

private var _toiletsPortable: ImageVector? = null
