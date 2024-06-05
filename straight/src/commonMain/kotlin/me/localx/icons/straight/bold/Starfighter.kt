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

public val Icons.Bold.Starfighter: ImageVector
    get() {
        if (_starfighter != null) {
            return _starfighter!!
        }
        _starfighter = Builder(name = "Starfighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                verticalLineToRelative(7.0f)
                lineTo(16.855f, 13.0f)
                curveTo(16.526f, 7.841f, 15.458f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(7.474f, 7.841f, 7.145f, 13.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 19.621f)
                lineTo(7.379f, 24.0f)
                lineTo(10.0f, 24.0f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.677f)
                lineTo(21.0f, 19.642f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 6.0f)
                close()
                moveTo(7.0f, 17.25f)
                verticalLineToRelative(2.129f)
                lineTo(3.621f, 16.0f)
                horizontalLineToRelative(3.4f)
                curveTo(7.0f, 16.593f, 7.0f, 17.029f, 7.0f, 17.25f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(10.0f, 17.25f)
                arcTo(55.15f, 55.15f, 0.0f, false, true, 11.083f, 6.267f)
                arcToRelative(1.708f, 1.708f, 0.0f, false, true, 1.834f, 0.0f)
                arcTo(55.15f, 55.15f, 0.0f, false, true, 14.0f, 17.25f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(17.0f, 17.25f)
                curveToRelative(0.0f, -0.221f, 0.0f, -0.657f, -0.016f, -1.25f)
                horizontalLineToRelative(3.4f)
                lineTo(17.0f, 19.414f)
                close()
            }
        }
        .build()
        return _starfighter!!
    }

private var _starfighter: ImageVector? = null
