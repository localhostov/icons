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

public val Icons.Outline.HandHoldingBox: ImageVector
    get() {
        if (_handHoldingBox != null) {
            return _handHoldingBox!!
        }
        _handHoldingBox = Builder(name = "HandHoldingBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.017f, 8.785f)
                curveToRelative(-0.595f, -0.542f, -1.364f, -0.816f, -2.168f, -0.782f)
                curveToRelative(-0.804f, 0.038f, -1.544f, 0.387f, -2.086f, 0.981f)
                lineToRelative(-3.216f, 3.534f)
                curveToRelative(-0.551f, -0.909f, -1.55f, -1.519f, -2.689f, -1.519f)
                lineTo(3.0f, 10.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(13.448f, 23.999f)
                lineToRelative(9.788f, -10.985f)
                curveToRelative(1.093f, -1.227f, 0.994f, -3.124f, -0.219f, -4.229f)
                close()
                moveTo(21.743f, 11.684f)
                lineToRelative(-9.191f, 10.315f)
                lineTo(3.0f, 21.999f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(12.858f, 12.999f)
                curveToRelative(0.63f, 0.0f, 1.142f, 0.513f, 1.142f, 1.143f)
                curveToRelative(0.0f, 0.564f, -0.421f, 1.051f, -0.981f, 1.13f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.283f, 1.98f)
                lineToRelative(5.16f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.13f, -0.987f, 2.515f, -2.059f)
                lineToRelative(4.426f, -4.864f)
                curveToRelative(0.182f, -0.199f, 0.43f, -0.316f, 0.7f, -0.329f)
                curveToRelative(0.274f, -0.016f, 0.528f, 0.081f, 0.728f, 0.263f)
                curveToRelative(0.407f, 0.371f, 0.44f, 1.009f, 0.073f, 1.421f)
                close()
                moveTo(15.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 2.5f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 2.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _handHoldingBox!!
    }

private var _handHoldingBox: ImageVector? = null
