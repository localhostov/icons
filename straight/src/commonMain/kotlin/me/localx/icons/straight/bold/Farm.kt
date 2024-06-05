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

public val Icons.Bold.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 10.501f)
                verticalLineToRelative(13.499f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.211f)
                lineToRelative(-1.631f, -1.335f)
                lineToRelative(1.631f, -1.335f)
                verticalLineToRelative(-3.12f)
                horizontalLineToRelative(-0.925f)
                lineToRelative(-3.075f, 2.516f)
                lineToRelative(-3.075f, -2.516f)
                horizontalLineToRelative(-0.925f)
                verticalLineToRelative(3.12f)
                lineToRelative(1.631f, 1.335f)
                lineToRelative(-1.631f, 1.335f)
                verticalLineToRelative(3.211f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.501f)
                curveToRelative(0.0f, -0.676f, 0.198f, -1.33f, 0.573f, -1.892f)
                lineTo(3.755f, 3.836f)
                curveToRelative(0.368f, -0.552f, 0.884f, -0.981f, 1.493f, -1.242f)
                lineTo(10.657f, 0.275f)
                curveToRelative(0.854f, -0.365f, 1.833f, -0.365f, 2.685f, 0.0f)
                lineToRelative(5.409f, 2.318f)
                curveToRelative(0.609f, 0.262f, 1.125f, 0.691f, 1.493f, 1.242f)
                lineToRelative(3.183f, 4.774f)
                curveToRelative(0.375f, 0.562f, 0.573f, 1.215f, 0.573f, 1.891f)
                close()
                moveTo(21.0f, 10.501f)
                curveToRelative(0.0f, -0.081f, -0.024f, -0.159f, -0.068f, -0.227f)
                lineToRelative(-3.183f, -4.774f)
                curveToRelative(-0.044f, -0.066f, -0.106f, -0.118f, -0.18f, -0.149f)
                lineToRelative(-5.408f, -2.317f)
                curveToRelative(-0.103f, -0.044f, -0.219f, -0.044f, -0.323f, 0.0f)
                lineToRelative(-5.408f, 2.318f)
                curveToRelative(-0.073f, 0.031f, -0.135f, 0.083f, -0.18f, 0.149f)
                lineToRelative(-3.182f, 4.773f)
                curveToRelative(-0.045f, 0.068f, -0.069f, 0.146f, -0.069f, 0.227f)
                verticalLineToRelative(10.499f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, 1.567f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                lineTo(20.999f, 10.501f)
                close()
                moveTo(8.754f, 24.0f)
                horizontalLineToRelative(6.439f)
                lineToRelative(-3.193f, -2.607f)
                lineToRelative(-3.246f, 2.607f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
