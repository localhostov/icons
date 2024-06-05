package me.localx.icons.rounded.bold

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
                moveToRelative(14.0f, 7.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 16.43f)
                verticalLineToRelative(2.07f)
                curveToRelative(0.0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.467f, 3.467f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(6.118f)
                lineToRelative(1.546f, 2.961f)
                curveToRelative(0.298f, 0.572f, 0.454f, 1.207f, 0.454f, 1.851f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(16.0f, 3.051f)
                curveToRelative(-0.162f, -0.033f, -0.329f, -0.051f, -0.5f, -0.051f)
                lineTo(6.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.5f)
                close()
            }
        }
        .build()
        return _auditAlt!!
    }

private var _auditAlt: ImageVector? = null
