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

public val Icons.Bold.C: ImageVector
    get() {
        if (_c != null) {
            return _c!!
        }
        _c = Builder(name = "C", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.956f, 24.0f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-5.515f, 0.0f, -10.001f, -4.527f, -10.001f, -10.091f)
                verticalLineToRelative(-3.818f)
                curveTo(2.0f, 4.527f, 6.487f, 0.0f, 12.001f, 0.0f)
                horizontalLineToRelative(0.955f)
                curveToRelative(3.858f, 0.0f, 7.323f, 2.148f, 9.041f, 5.605f)
                lineToRelative(-2.688f, 1.335f)
                curveToRelative(-1.207f, -2.43f, -3.642f, -3.94f, -6.354f, -3.94f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-3.861f, 0.0f, -7.001f, 3.181f, -7.001f, 7.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 3.91f, 3.141f, 7.091f, 7.001f, 7.091f)
                horizontalLineToRelative(0.955f)
                curveToRelative(2.664f, 0.0f, 5.079f, -1.472f, 6.305f, -3.841f)
                lineToRelative(2.664f, 1.378f)
                curveToRelative(-1.742f, 3.37f, -5.179f, 5.463f, -8.969f, 5.463f)
                close()
            }
        }
        .build()
        return _c!!
    }

private var _c: ImageVector? = null
