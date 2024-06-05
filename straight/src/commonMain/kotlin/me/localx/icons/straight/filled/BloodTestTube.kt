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

public val Icons.Filled.BloodTestTube: ImageVector
    get() {
        if (_bloodTestTube != null) {
            return _bloodTestTube!!
        }
        _bloodTestTube = Builder(name = "BloodTestTube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 20.0f)
                curveToRelative(-1.335f, 0.0f, -2.591f, -0.52f, -3.535f, -1.464f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.122f, 0.0f, -7.071f)
                lineToRelative(3.535f, -3.458f)
                lineToRelative(3.528f, 3.45f)
                curveToRelative(1.957f, 1.958f, 1.957f, 5.129f, 0.008f, 7.079f)
                curveToRelative(-0.945f, 0.944f, -2.201f, 1.464f, -3.536f, 1.464f)
                close()
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(12.051f, 19.95f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                lineToRelative(1.074f, -1.05f)
                lineTo(4.0f, 9.001f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.014f, 0.0f, 3.743f, -1.203f, 4.534f, -2.923f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.535f, -0.306f, -1.036f, -0.68f, -1.483f, -1.128f)
                close()
            }
        }
        .build()
        return _bloodTestTube!!
    }

private var _bloodTestTube: ImageVector? = null
