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

public val Icons.Outline.EndlessLoop: ImageVector
    get() {
        if (_endlessLoop != null) {
            return _endlessLoop!!
        }
        _endlessLoop = Builder(name = "EndlessLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.364f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(5.549f)
                lineToRelative(-4.759f, -4.795f)
                lineToRelative(1.42f, -1.409f)
                lineToRelative(5.677f, 5.721f)
                curveToRelative(0.817f, 0.817f, 0.817f, 2.151f, -0.003f, 2.97f)
                lineToRelative(-5.674f, 5.718f)
                lineToRelative(-1.42f, -1.409f)
                lineToRelative(4.759f, -4.795f)
                horizontalLineToRelative(-5.549f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                curveToRelative(0.0f, -2.512f, -1.695f, -4.632f, -4.0f, -5.287f)
                verticalLineToRelative(-2.062f)
                curveToRelative(3.419f, 0.697f, 6.0f, 3.727f, 6.0f, 7.349f)
                close()
            }
        }
        .build()
        return _endlessLoop!!
    }

private var _endlessLoop: ImageVector? = null
