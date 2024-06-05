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

public val Icons.Outline.FanTable: ImageVector
    get() {
        if (_fanTable != null) {
            return _fanTable!!
        }
        _fanTable = Builder(name = "FanTable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 9.5f)
                curveTo(21.5f, 4.262f, 17.238f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.5f, 4.262f, 2.5f, 9.5f)
                curveToRelative(0.0f, 4.9f, 3.73f, 8.945f, 8.5f, 9.446f)
                verticalLineToRelative(3.054f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.054f)
                curveToRelative(4.77f, -0.502f, 8.5f, -4.546f, 8.5f, -9.446f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.375f, 0.0f, -2.66f, -0.378f, -3.769f, -1.026f)
                curveToRelative(1.24f, -1.28f, 2.776f, -3.277f, 3.769f, -4.68f)
                curveToRelative(0.993f, 1.402f, 2.529f, 3.399f, 3.769f, 4.68f)
                curveToRelative(-1.109f, 0.648f, -2.394f, 1.026f, -3.769f, 1.026f)
                close()
                moveTo(17.358f, 14.739f)
                curveToRelative(-0.927f, -0.929f, -2.234f, -2.565f, -3.23f, -3.914f)
                curveToRelative(1.64f, 0.348f, 3.692f, 0.909f, 4.87f, 1.352f)
                curveToRelative(-0.37f, 0.965f, -0.93f, 1.836f, -1.64f, 2.563f)
                close()
                moveTo(19.5f, 9.5f)
                curveToRelative(0.0f, 0.244f, -0.014f, 0.484f, -0.037f, 0.722f)
                curveToRelative(-1.642f, -0.588f, -4.198f, -1.251f, -5.976f, -1.554f)
                curveToRelative(0.677f, -1.608f, 1.562f, -4.081f, 1.96f, -5.822f)
                curveToRelative(2.405f, 1.251f, 4.053f, 3.761f, 4.053f, 6.654f)
                close()
                moveTo(13.553f, 2.164f)
                curveToRelative(-0.252f, 1.206f, -0.932f, 3.258f, -1.553f, 4.859f)
                curveToRelative(-0.621f, -1.602f, -1.302f, -3.654f, -1.553f, -4.86f)
                curveToRelative(0.502f, -0.106f, 1.021f, -0.164f, 1.553f, -0.164f)
                reflectiveCurveToRelative(1.052f, 0.058f, 1.553f, 0.164f)
                close()
                moveTo(8.553f, 2.846f)
                curveToRelative(0.397f, 1.74f, 1.282f, 4.214f, 1.96f, 5.822f)
                curveToRelative(-1.778f, 0.303f, -4.335f, 0.967f, -5.977f, 1.554f)
                curveToRelative(-0.023f, -0.238f, -0.037f, -0.479f, -0.037f, -0.722f)
                curveToRelative(0.0f, -2.893f, 1.649f, -5.403f, 4.053f, -6.654f)
                close()
                moveTo(5.002f, 12.176f)
                curveToRelative(1.179f, -0.442f, 3.23f, -1.003f, 4.87f, -1.352f)
                curveToRelative(-0.996f, 1.349f, -2.303f, 2.985f, -3.23f, 3.914f)
                curveToRelative(-0.71f, -0.726f, -1.27f, -1.597f, -1.64f, -2.563f)
                close()
            }
        }
        .build()
        return _fanTable!!
    }

private var _fanTable: ImageVector? = null
