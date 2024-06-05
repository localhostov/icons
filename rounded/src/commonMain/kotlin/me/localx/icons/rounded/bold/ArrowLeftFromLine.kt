package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ArrowLeftFromLine: ImageVector
    get() {
        if (_arrowLeftFromLine != null) {
            return _arrowLeftFromLine!!
        }
        _arrowLeftFromLine = Builder(name = "ArrowLeftFromLine", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.5f)
                lineTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(21.0f, 1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 10.5f)
                lineTo(4.25f, 10.5f)
                lineToRelative(3.33f, -3.46f)
                curveToRelative(0.57f, -0.6f, 0.56f, -1.55f, -0.04f, -2.12f)
                curveToRelative(-0.6f, -0.58f, -1.55f, -0.56f, -2.12f, 0.04f)
                lineTo(1.03f, 9.52f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.01f, 2.45f)
                lineToRelative(4.41f, 4.59f)
                curveToRelative(0.29f, 0.31f, 0.69f, 0.46f, 1.08f, 0.46f)
                reflectiveCurveToRelative(0.75f, -0.14f, 1.04f, -0.42f)
                curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.04f, -2.12f)
                lineToRelative(-3.33f, -3.46f)
                horizontalLineToRelative(13.25f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowLeftFromLine!!
    }

private var _arrowLeftFromLine: ImageVector? = null
