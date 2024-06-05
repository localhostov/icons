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

public val Icons.Bold.InsertAlt: ImageVector
    get() {
        if (_insertAlt != null) {
            return _insertAlt!!
        }
        _insertAlt = Builder(name = "InsertAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-13.329f)
                lineToRelative(2.389f, 2.389f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-4.243f, -4.243f)
                curveToRelative(-0.975f, -0.975f, -0.975f, -2.561f, 0.0f, -3.535f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.389f, 2.389f)
                horizontalLineToRelative(13.329f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                curveToRelative(3.525f, 0.0f, 6.574f, 2.042f, 8.05f, 5.0f)
                horizontalLineToRelative(3.25f)
                curveTo(21.647f, 3.347f, 17.213f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(5.213f, 0.0f, 9.647f, -3.347f, 11.3f, -8.0f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.476f, 2.958f, -4.526f, 5.0f, -8.05f, 5.0f)
                close()
            }
        }
        .build()
        return _insertAlt!!
    }

private var _insertAlt: ImageVector? = null
