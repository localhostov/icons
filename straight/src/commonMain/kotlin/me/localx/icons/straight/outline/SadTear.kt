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

public val Icons.Outline.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(10.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 9.5f)
                close()
                moveTo(14.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 9.5f)
                close()
                moveTo(10.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                curveToRelative(0.0f, -1.59f, 2.0f, -3.6f, 2.0f, -3.6f)
                reflectiveCurveTo(10.0f, 14.369f, 10.0f, 16.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, 5.666f, 2.254f)
                lineToRelative(-1.33f, 1.493f)
                arcTo(7.517f, 7.517f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.457f, -1.962f)
                curveTo(11.7f, 14.027f, 11.843f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
