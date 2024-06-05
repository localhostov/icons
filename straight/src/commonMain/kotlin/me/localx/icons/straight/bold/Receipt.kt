package me.localx.icons.straight.bold

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

public val Icons.Bold.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.936f, 0.0f)
                horizontalLineTo(126.987f)
                curveTo(92.2f, 0.0f, 64.0f, 28.2f, 64.0f, 62.987f)
                verticalLineToRelative(448.637f)
                lineToRelative(83.983f, -58.389f)
                lineToRelative(52.489f, 36.533f)
                lineToRelative(52.489f, -36.512f)
                lineToRelative(52.489f, 36.512f)
                lineToRelative(52.489f, -36.491f)
                lineToRelative(83.983f, 58.473f)
                verticalLineTo(62.987f)
                curveTo(441.923f, 28.2f, 413.723f, 0.0f, 378.936f, 0.0f)
                close()
                moveTo(378.936f, 391.066f)
                lineToRelative(-20.996f, -14.55f)
                lineToRelative(-52.489f, 36.533f)
                lineToRelative(-52.489f, -36.512f)
                lineToRelative(-52.489f, 36.512f)
                lineToRelative(-52.489f, -36.491f)
                lineToRelative(-20.996f, 14.697f)
                verticalLineTo(62.987f)
                horizontalLineToRelative(251.949f)
                verticalLineTo(391.066f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.667f, 128.0f)
                horizontalLineToRelative(170.667f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-170.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.667f, 234.667f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-128.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
