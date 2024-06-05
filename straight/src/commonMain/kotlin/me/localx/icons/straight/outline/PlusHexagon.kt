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

public val Icons.Outline.PlusHexagon: ImageVector
    get() {
        if (_plusHexagon != null) {
            return _plusHexagon!!
        }
        _plusHexagon = Builder(name = "PlusHexagon", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(21.873f, 12.508f)
                lineToRelative(-4.252f, 7.964f)
                curveToRelative(-0.175f, 0.326f, -0.513f, 0.528f, -0.883f, 0.528f)
                lineTo(7.281f, 21.0f)
                curveToRelative(-0.369f, 0.0f, -0.707f, -0.202f, -0.882f, -0.526f)
                lineToRelative(-4.271f, -7.959f)
                curveToRelative(-0.171f, -0.319f, -0.171f, -0.701f, 0.0f, -1.02f)
                lineTo(6.401f, 3.527f)
                curveToRelative(0.174f, -0.325f, 0.512f, -0.527f, 0.881f, -0.527f)
                horizontalLineToRelative(9.456f)
                curveToRelative(0.37f, 0.0f, 0.708f, 0.203f, 0.883f, 0.529f)
                lineToRelative(4.252f, 7.963f)
                curveToRelative(0.17f, 0.317f, 0.17f, 0.697f, 0.0f, 1.015f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _plusHexagon!!
    }

private var _plusHexagon: ImageVector? = null
