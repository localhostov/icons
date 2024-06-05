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

public val Icons.Outline.AngleDoubleSmallUp: ImageVector
    get() {
        if (_angleDoubleSmallUp != null) {
            return _angleDoubleSmallUp!!
        }
        _angleDoubleSmallUp = Builder(name = "AngleDoubleSmallUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.281f, 11.281f)
                lineToRelative(-5.281f, -5.281f)
                lineToRelative(-5.281f, 5.281f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(5.281f, -5.281f)
                curveToRelative(0.756f, -0.756f, 2.072f, -0.756f, 2.828f, 0.0f)
                lineToRelative(5.281f, 5.281f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(18.695f, 16.872f)
                lineToRelative(-5.871f, -5.871f)
                curveToRelative(-0.455f, -0.455f, -1.193f, -0.455f, -1.648f, 0.0f)
                lineToRelative(-5.871f, 5.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.281f, -5.281f)
                lineToRelative(5.281f, 5.281f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallUp!!
    }

private var _angleDoubleSmallUp: ImageVector? = null
