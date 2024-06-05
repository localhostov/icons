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

public val Icons.Bold.MembershipVip: ImageVector
    get() {
        if (_membershipVip != null) {
            return _membershipVip!!
        }
        _membershipVip = Builder(name = "MembershipVip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(15.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(5.2f, 15.394f)
                curveToRelative(0.278f, 0.264f, 0.597f, 0.48f, 0.941f, 0.655f)
                lineToRelative(1.819f, -1.407f)
                lineToRelative(1.81f, 1.399f)
                curveToRelative(0.347f, -0.179f, 0.669f, -0.396f, 0.947f, -0.664f)
                lineToRelative(-0.743f, -2.259f)
                lineToRelative(1.925f, -1.114f)
                curveToRelative(-0.044f, -0.35f, -0.119f, -0.69f, -0.247f, -1.006f)
                horizontalLineToRelative(-2.448f)
                lineToRelative(-0.689f, -2.446f)
                curveToRelative(-0.203f, -0.032f, -0.355f, -0.054f, -0.567f, -0.054f)
                curveToRelative(-0.205f, 0.0f, -0.281f, 0.013f, -0.478f, 0.042f)
                lineToRelative(-0.759f, 2.458f)
                horizontalLineToRelative(-2.466f)
                curveToRelative(-0.127f, 0.314f, -0.202f, 0.651f, -0.246f, 0.998f)
                lineToRelative(1.941f, 1.08f)
                lineToRelative(-0.741f, 2.316f)
                close()
            }
        }
        .build()
        return _membershipVip!!
    }

private var _membershipVip: ImageVector? = null
