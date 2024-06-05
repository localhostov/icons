package me.localx.icons.straight.filled

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

public val Icons.Filled.AuditAlt: ImageVector
    get() {
        if (_auditAlt != null) {
            return _auditAlt!!
        }
        _auditAlt = Builder(name = "AuditAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 0.0f)
                lineTo(1.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(14.0f)
                lineTo(15.0f, 0.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(23.0f, 15.764f)
                verticalLineToRelative(5.236f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.764f)
                lineToRelative(2.0f, 4.0f)
                close()
            }
        }
        .build()
        return _auditAlt!!
    }

private var _auditAlt: ImageVector? = null
