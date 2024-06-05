package me.localx.icons.rounded.bold

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

public val Icons.Bold.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.561f, 14.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.379f, 0.621f)
                arcToRelative(2.122f, 2.122f, 0.0f, false, false, -3.0f, 0.0f)
                lineToRelative(-0.258f, 0.258f)
                arcToRelative(7.237f, 7.237f, 0.0f, false, false, -1.625f, 2.5f)
                lineTo(16.713f, 5.166f)
                arcToRelative(6.36f, 6.36f, 0.0f, false, false, -8.008f, 0.539f)
                arcToRelative(5.366f, 5.366f, 0.0f, false, false, -0.489f, 0.561f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.2f, 0.762f)
                arcTo(7.545f, 7.545f, 0.0f, false, false, 2.211f, 9.211f)
                curveToRelative(-3.151f, 3.151f, -2.894f, 8.536f, 0.574f, 12.0f)
                arcToRelative(9.292f, 9.292f, 0.0f, false, false, 6.529f, 2.779f)
                arcToRelative(7.659f, 7.659f, 0.0f, false, false, 5.475f, -2.2f)
                arcToRelative(7.545f, 7.545f, 0.0f, false, false, 2.183f, -4.81f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.762f, -1.195f)
                arcTo(5.366f, 5.366f, 0.0f, false, false, 18.3f, 15.3f)
                arcToRelative(6.36f, 6.36f, 0.0f, false, false, 0.539f, -8.008f)
                lineTo(20.617f, 5.5f)
                arcToRelative(7.237f, 7.237f, 0.0f, false, false, 2.5f, -1.625f)
                lineToRelative(0.258f, -0.258f)
                arcToRelative(2.122f, 2.122f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(16.174f, 13.174f)
                arcToRelative(2.481f, 2.481f, 0.0f, false, true, -0.252f, 0.22f)
                arcToRelative(4.683f, 4.683f, 0.0f, false, false, -1.941f, 3.348f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, true, -1.313f, 2.926f)
                curveToRelative(-1.982f, 1.982f, -5.464f, 1.724f, -7.762f, -0.574f)
                reflectiveCurveToRelative(-2.555f, -5.781f, -0.574f, -7.762f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, true, 2.925f, -1.313f)
                arcToRelative(4.683f, 4.683f, 0.0f, false, false, 3.349f, -1.941f)
                arcToRelative(2.481f, 2.481f, 0.0f, false, true, 0.22f, -0.252f)
                arcTo(2.923f, 2.923f, 0.0f, false, true, 12.92f, 7.0f)
                arcToRelative(3.811f, 3.811f, 0.0f, false, true, 1.59f, 0.371f)
                lineToRelative(-1.071f, 1.07f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.076f, -1.076f)
                arcTo(3.24f, 3.24f, 0.0f, false, true, 16.174f, 13.174f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
