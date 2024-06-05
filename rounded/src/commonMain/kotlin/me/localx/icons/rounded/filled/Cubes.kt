package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.57f)
                lineToRelative(4.93f, -2.46f)
                lineTo(13.34f, 0.32f)
                curveToRelative(-0.84f, -0.42f, -1.84f, -0.42f, -2.68f, 0.0f)
                lineToRelative(-3.58f, 1.79f)
                lineToRelative(4.93f, 2.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 17.12f)
                lineTo(0.0f, 14.63f)
                verticalLineToRelative(4.74f)
                curveToRelative(0.0f, 1.07f, 0.57f, 2.07f, 1.51f, 2.6f)
                lineToRelative(3.49f, 2.0f)
                verticalLineToRelative(-6.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.98f)
                lineToRelative(3.49f, -2.0f)
                curveToRelative(0.93f, -0.53f, 1.51f, -1.53f, 1.51f, -2.6f)
                verticalLineToRelative(-4.74f)
                reflectiveCurveToRelative(-5.0f, 2.49f, -5.0f, 2.49f)
                verticalLineToRelative(6.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.89f, 10.84f)
                lineToRelative(-4.01f, 2.02f)
                lineToRelative(5.12f, 2.51f)
                lineToRelative(3.89f, -1.96f)
                lineToRelative(-5.0f, -2.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.73f)
                lineToRelative(0.0f, -5.5f)
                lineToRelative(-5.0f, -2.49f)
                lineToRelative(0.0f, 5.42f)
                lineToRelative(5.0f, 2.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.16f)
                lineToRelative(0.0f, -5.42f)
                lineToRelative(-5.0f, 2.49f)
                lineToRelative(0.0f, 5.5f)
                lineToRelative(5.0f, -2.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.11f, 10.84f)
                lineToRelative(-5.0f, 2.57f)
                lineToRelative(3.89f, 1.96f)
                lineToRelative(5.12f, -2.51f)
                lineToRelative(-4.01f, -2.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.12f)
                lineToRelative(-4.0f, 1.95f)
                lineToRelative(0.0f, 6.86f)
                lineToRelative(4.0f, -2.25f)
                lineToRelative(0.0f, -6.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.12f)
                lineToRelative(0.0f, 6.55f)
                lineToRelative(4.0f, 2.24f)
                lineToRelative(0.0f, -6.86f)
                lineToRelative(-4.0f, -1.93f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
