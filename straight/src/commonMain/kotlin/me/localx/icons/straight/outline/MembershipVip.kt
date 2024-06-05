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

public val Icons.Outline.MembershipVip: ImageVector
    get() {
        if (_membershipVip != null) {
            return _membershipVip!!
        }
        _membershipVip = Builder(name = "MembershipVip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 3.0f)
                lineTo(2.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.755f, 11.0f)
                horizontalLineToRelative(3.245f)
                verticalLineToRelative(0.688f)
                lineToRelative(-2.475f, 1.432f)
                lineToRelative(0.994f, 3.022f)
                lineToRelative(-0.562f, 0.392f)
                lineToRelative(-2.446f, -1.891f)
                lineToRelative(-2.456f, 1.899f)
                lineToRelative(-0.541f, -0.407f)
                lineToRelative(0.978f, -3.057f)
                lineToRelative(-2.492f, -1.386f)
                verticalLineToRelative(-0.691f)
                horizontalLineToRelative(3.263f)
                lineToRelative(0.883f, -3.375f)
                horizontalLineToRelative(0.727f)
                lineToRelative(0.882f, 3.375f)
                close()
            }
        }
        .build()
        return _membershipVip!!
    }

private var _membershipVip: ImageVector? = null
