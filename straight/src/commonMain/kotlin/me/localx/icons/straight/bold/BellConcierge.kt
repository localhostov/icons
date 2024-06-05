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

public val Icons.Bold.BellConcierge: ImageVector
    get() {
        if (_bellConcierge != null) {
            return _bellConcierge!!
        }
        _bellConcierge = Builder(name = "BellConcierge", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -6.109f, -4.589f, -11.166f, -10.5f, -11.906f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.594f)
                curveTo(4.589f, 3.334f, 0.0f, 8.391f, 0.0f, 14.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3.0f, 14.5f)
                curveToRelative(0.0f, -4.962f, 4.038f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _bellConcierge!!
    }

private var _bellConcierge: ImageVector? = null
