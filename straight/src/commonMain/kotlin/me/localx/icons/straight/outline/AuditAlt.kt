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

public val Icons.Outline.AuditAlt: ImageVector
    get() {
        if (_auditAlt != null) {
            return _auditAlt!!
        }
        _auditAlt = Builder(name = "AuditAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.0f, 15.764f)
                verticalLineToRelative(5.236f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.764f)
                lineToRelative(2.0f, 4.0f)
                close()
                moveTo(3.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                lineTo(15.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(21.0f, 16.236f)
                lineToRelative(-2.0f, -4.0f)
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.764f)
                close()
            }
        }
        .build()
        return _auditAlt!!
    }

private var _auditAlt: ImageVector? = null
