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

public val Icons.Bold.ResistanceBand: ImageVector
    get() {
        if (_resistanceBand != null) {
            return _resistanceBand!!
        }
        _resistanceBand = Builder(name = "ResistanceBand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 15.276f)
                verticalLineToRelative(-4.003f)
                curveToRelative(-1.241f, -1.41f, -2.0f, -3.253f, -2.0f, -5.274f)
                curveToRelative(0.0f, -0.458f, 0.047f, -0.905f, 0.122f, -1.342f)
                curveToRelative(-0.713f, 1.289f, -1.122f, 2.768f, -1.122f, 4.342f)
                verticalLineToRelative(6.276f)
                curveToRelative(-1.742f, 0.621f, -3.0f, 2.271f, -3.0f, 4.224f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.953f, -1.258f, -3.602f, -3.0f, -4.224f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21.0f, 15.276f)
                verticalLineToRelative(-6.276f)
                curveTo(21.0f, 4.037f, 16.962f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.538f, 0.0f, 2.937f, -0.586f, 4.0f, -1.54f)
                verticalLineToRelative(-1.46f)
                curveToRelative(0.0f, -1.025f, -0.399f, -1.951f, -1.034f, -2.659f)
                curveToRelative(-0.172f, 1.492f, -1.428f, 2.659f, -2.966f, 2.659f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(6.276f)
                curveToRelative(-1.742f, 0.621f, -3.0f, 2.271f, -3.0f, 4.224f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.953f, -1.258f, -3.602f, -3.0f, -4.224f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _resistanceBand!!
    }

private var _resistanceBand: ImageVector? = null
