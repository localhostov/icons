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

public val Icons.Filled.MembershipVip: ImageVector
    get() {
        if (_membershipVip != null) {
            return _membershipVip!!
        }
        _membershipVip = Builder(name = "MembershipVip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(11.233f, 11.814f)
                lineToRelative(-1.774f, 1.445f)
                lineToRelative(0.734f, 2.235f)
                curveToRelative(0.1f, 0.302f, -0.001f, 0.635f, -0.254f, 0.83f)
                curveToRelative(-0.253f, 0.194f, -0.601f, 0.208f, -0.867f, 0.034f)
                lineToRelative(-2.065f, -1.345f)
                lineToRelative(-2.031f, 1.359f)
                curveToRelative(-0.126f, 0.085f, -0.272f, 0.127f, -0.417f, 0.127f)
                curveToRelative(-0.159f, 0.0f, -0.317f, -0.05f, -0.45f, -0.15f)
                curveToRelative(-0.255f, -0.191f, -0.361f, -0.522f, -0.266f, -0.825f)
                lineToRelative(0.706f, -2.262f)
                lineToRelative(-1.783f, -1.451f)
                curveToRelative(-0.24f, -0.204f, -0.327f, -0.535f, -0.219f, -0.83f)
                curveToRelative(0.108f, -0.295f, 0.389f, -0.491f, 0.704f, -0.491f)
                horizontalLineToRelative(2.251f)
                lineToRelative(0.797f, -2.235f)
                curveToRelative(0.109f, -0.293f, 0.39f, -0.488f, 0.703f, -0.488f)
                reflectiveCurveToRelative(0.594f, 0.195f, 0.703f, 0.488f)
                lineToRelative(0.797f, 2.235f)
                horizontalLineToRelative(2.251f)
                curveToRelative(0.315f, 0.0f, 0.597f, 0.197f, 0.705f, 0.493f)
                reflectiveCurveToRelative(0.019f, 0.628f, -0.222f, 0.831f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _membershipVip!!
    }

private var _membershipVip: ImageVector? = null
