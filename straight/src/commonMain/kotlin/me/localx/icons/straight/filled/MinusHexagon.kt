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

public val Icons.Filled.MinusHexagon: ImageVector
    get() {
        if (_minusHexagon != null) {
            return _minusHexagon!!
        }
        _minusHexagon = Builder(name = "MinusHexagon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.637f, 10.55f)
                lineToRelative(-4.252f, -7.962f)
                curveToRelative(-0.522f, -0.979f, -1.536f, -1.587f, -2.646f, -1.587f)
                lineTo(7.282f, 1.001f)
                curveToRelative(-1.108f, 0.0f, -2.122f, 0.606f, -2.644f, 1.582f)
                lineTo(0.366f, 10.549f)
                curveToRelative(-0.489f, 0.911f, -0.489f, 2.0f, 0.0f, 2.911f)
                lineToRelative(4.271f, 7.96f)
                curveToRelative(0.524f, 0.975f, 1.537f, 1.58f, 2.644f, 1.58f)
                horizontalLineToRelative(9.457f)
                curveToRelative(1.11f, 0.0f, 2.124f, -0.608f, 2.646f, -1.587f)
                lineToRelative(4.252f, -7.963f)
                curveToRelative(0.485f, -0.908f, 0.485f, -1.993f, 0.0f, -2.9f)
                close()
                moveTo(17.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _minusHexagon!!
    }

private var _minusHexagon: ImageVector? = null
