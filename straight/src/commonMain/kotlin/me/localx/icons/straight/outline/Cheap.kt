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

public val Icons.Outline.Cheap: ImageVector
    get() {
        if (_cheap != null) {
            return _cheap!!
        }
        _cheap = Builder(name = "Cheap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.7f, 19.214f)
                lineToRelative(-4.293f, 4.207f)
                curveToRelative(-0.385f, 0.385f, -0.894f, 0.579f, -1.404f, 0.579f)
                reflectiveCurveToRelative(-1.026f, -0.195f, -1.417f, -0.586f)
                lineToRelative(-4.25f, -4.25f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.252f, 3.252f)
                lineTo(17.026f, 0.0f)
                lineToRelative(2.0f, 0.002f)
                lineToRelative(-0.024f, 21.017f)
                lineToRelative(3.298f, -3.232f)
                lineToRelative(1.399f, 1.429f)
                close()
                moveTo(15.0f, 1.353f)
                curveToRelative(-1.473f, -0.855f, -3.178f, -1.353f, -5.0f, -1.353f)
                curveTo(4.486f, 0.0f, 0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(5.589f, 2.0f, 10.0f, 2.0f)
                curveToRelative(1.891f, 0.0f, 3.629f, 0.663f, 5.0f, 1.765f)
                verticalLineTo(1.353f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _cheap!!
    }

private var _cheap: ImageVector? = null
