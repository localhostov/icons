package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Kazoo: ImageVector
    get() {
        if (_kazoo != null) {
            return _kazoo!!
        }
        _kazoo = Builder(name = "Kazoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.732f, 14.611f)
                lineToRelative(-3.732f, 3.732f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(3.731f, -3.731f)
                curveToRelative(-2.753f, -0.737f, -4.92f, -2.904f, -5.657f, -5.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.5f, 1.662f)
                lineToRelative(-1.162f, -1.162f)
                curveToRelative(-0.539f, -0.539f, -1.384f, -0.623f, -2.019f, -0.2f)
                lineToRelative(-6.148f, 4.735f)
                curveToRelative(2.224f, 0.808f, 3.987f, 2.57f, 4.795f, 4.794f)
                lineToRelative(4.734f, -6.148f)
                curveToRelative(0.423f, -0.635f, 0.339f, -1.48f, -0.2f, -2.019f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.452f, 18.548f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(10.452f, 15.548f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.0f, 2.0f, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _kazoo!!
    }

private var _kazoo: ImageVector? = null
