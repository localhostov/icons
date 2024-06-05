package me.localx.icons.straight.filled

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

public val Icons.Filled.Citrus: ImageVector
    get() {
        if (_citrus != null) {
            return _citrus!!
        }
        _citrus = Builder(name = "Citrus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.62f, 6.179f)
                curveToRelative(-1.897f, 1.64f, -4.444f, 1.822f, -5.389f, 1.822f)
                curveToRelative(-0.166f, 0.0f, -2.23f, 0.0f, -2.23f, 0.0f)
                curveToRelative(0.0f, -3.662f, -1.184f, -6.8f, -1.81f, -7.948f)
                lineToRelative(-1.756f, 0.958f)
                curveToRelative(0.334f, 0.611f, 1.07f, 2.408f, 1.399f, 4.732f)
                curveToRelative(-0.692f, -1.104f, -1.554f, -2.194f, -2.388f, -3.143f)
                curveTo(4.117f, 4.078f, 1.0f, 8.17f, 1.0f, 13.0f)
                curveToRelative(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.925f, 11.0f, -11.0f)
                curveToRelative(0.0f, -2.579f, -0.894f, -4.945f, -2.38f, -6.821f)
                close()
                moveTo(13.5f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.004f, 5.996f)
                reflectiveCurveToRelative(-0.158f, -2.861f, 1.51f, -4.529f)
                reflectiveCurveTo(20.992f, 0.008f, 20.992f, 0.008f)
                curveToRelative(0.0f, 0.0f, 0.209f, 2.81f, -1.459f, 4.478f)
                curveToRelative(-1.668f, 1.668f, -4.529f, 1.51f, -4.529f, 1.51f)
                close()
            }
        }
        .build()
        return _citrus!!
    }

private var _citrus: ImageVector? = null
