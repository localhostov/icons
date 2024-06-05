package me.localx.icons.straight.outline

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

public val Icons.Outline.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(5.988f, 15.0f, 2.0f, 13.194f, 2.0f, 12.0f)
                reflectiveCurveTo(5.988f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(10.0f, 1.806f, 10.0f, 3.0f)
                reflectiveCurveTo(18.012f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, true, 9.473f, 6.822f)
                arcTo(22.013f, 22.013f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(22.013f, 22.013f, 0.0f, false, false, 2.527f, 8.822f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, true, -9.473f, -6.822f)
                arcTo(22.013f, 22.013f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(22.013f, 22.013f, 0.0f, false, false, 9.473f, -1.822f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
