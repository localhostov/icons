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

public val Icons.Bold.AuditAlt: ImageVector
    get() {
        if (_auditAlt != null) {
            return _auditAlt!!
        }
        _auditAlt = Builder(name = "AuditAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 6.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(23.0f, 15.449f)
                verticalLineToRelative(5.551f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(8.619f)
                lineToRelative(2.0f, 3.83f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(16.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _auditAlt!!
    }

private var _auditAlt: ImageVector? = null
