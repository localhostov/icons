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

public val Icons.Filled.RulesAlt: ImageVector
    get() {
        if (_rulesAlt != null) {
            return _rulesAlt!!
        }
        _rulesAlt = Builder(name = "RulesAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(15.765f)
                curveToRelative(0.549f, -0.494f, 1.262f, -0.766f, 2.0f, -0.765f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-14.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(16.414f, 12.0f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                close()
                moveTo(18.931f, 3.93f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-2.543f, 2.631f)
                lineToRelative(-1.496f, -1.581f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.037f, 2.152f)
                curveToRelative(0.455f, 0.478f, 1.216f, 0.481f, 1.674f, 0.007f)
                lineToRelative(3.113f, -3.221f)
                close()
            }
        }
        .build()
        return _rulesAlt!!
    }

private var _rulesAlt: ImageVector? = null
