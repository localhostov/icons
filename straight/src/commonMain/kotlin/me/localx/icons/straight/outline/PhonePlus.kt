package me.localx.icons.straight.outline

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

public val Icons.Outline.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) {
            return _phonePlus!!
        }
        _phonePlus = Builder(name = "PhonePlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.199f, 16.262f)
                curveToRelative(-2.96f, -1.282f, -5.08f, -3.407f, -6.453f, -6.469f)
                lineToRelative(3.405f, -3.406f)
                lineTo(4.887f, 0.122f)
                lineTo(1.717f, 3.292f)
                curveToRelative(-1.107f, 1.104f, -1.717f, 2.599f, -1.717f, 4.208f)
                curveToRelative(0.0f, 7.248f, 9.252f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.608f, 0.0f, 3.103f, -0.609f, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                lineToRelative(-3.414f, 3.414f)
                close()
                moveTo(19.292f, 20.871f)
                curveToRelative(-0.727f, 0.728f, -1.718f, 1.129f, -2.792f, 1.129f)
                curveToRelative(-6.233f, 0.0f, -14.5f, -8.266f, -14.5f, -14.5f)
                curveToRelative(0.0f, -1.074f, 0.401f, -2.066f, 1.13f, -2.793f)
                lineToRelative(1.757f, -1.757f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-2.935f, 2.936f)
                lineToRelative(0.246f, 0.613f)
                curveToRelative(1.64f, 4.085f, 4.481f, 6.924f, 8.446f, 8.437f)
                lineToRelative(0.605f, 0.231f)
                lineToRelative(2.927f, -2.927f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-1.758f, 1.758f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
