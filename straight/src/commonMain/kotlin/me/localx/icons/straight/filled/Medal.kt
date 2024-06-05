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

public val Icons.Filled.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.447f, 6.912f)
                curveToRelative(-1.731f, -1.595f, -3.973f, -2.643f, -6.449f, -2.867f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(7.867f)
                lineToRelative(-3.42f, 6.912f)
                close()
                moveTo(10.996f, 4.046f)
                lineToRelative(-1.996f, -4.046f)
                lineTo(1.028f, 0.0f)
                lineToRelative(3.446f, 6.985f)
                curveToRelative(1.74f, -1.635f, 4.01f, -2.71f, 6.522f, -2.939f)
                close()
                moveTo(21.0f, 15.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                reflectiveCurveTo(7.038f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(17.0f, 13.5f)
                horizontalLineToRelative(-3.582f)
                lineToRelative(-0.996f, -3.528f)
                horizontalLineToRelative(-0.822f)
                lineToRelative(-0.997f, 3.528f)
                horizontalLineToRelative(-3.602f)
                verticalLineToRelative(0.747f)
                lineToRelative(2.702f, 1.578f)
                lineToRelative(-1.074f, 3.175f)
                lineToRelative(0.611f, 0.46f)
                lineToRelative(2.773f, -2.145f)
                lineToRelative(2.762f, 2.136f)
                lineToRelative(0.635f, -0.443f)
                lineToRelative(-1.154f, -3.135f)
                lineToRelative(2.744f, -1.63f)
                verticalLineToRelative(-0.742f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
