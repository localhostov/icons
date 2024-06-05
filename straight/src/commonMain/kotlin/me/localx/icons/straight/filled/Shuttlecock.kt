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

public val Icons.Filled.Shuttlecock: ImageVector
    get() {
        if (_shuttlecock != null) {
            return _shuttlecock!!
        }
        _shuttlecock = Builder(name = "Shuttlecock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.491f, 16.559f)
                lineToRelative(4.95f, 4.95f)
                lineTo(5.975f, 22.975f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.95f, -4.95f)
                close()
                moveTo(23.983f, 13.259f)
                lineTo(23.354f, 13.889f)
                curveToRelative(-4.09f, 4.091f, -9.216f, 5.794f, -13.882f, 6.819f)
                lineTo(3.288f, 14.528f)
                curveTo(4.313f, 9.863f, 6.015f, 4.738f, 10.107f, 0.646f)
                lineToRelative(0.629f, -0.629f)
                lineToRelative(0.7f, 0.551f)
                curveToRelative(0.1f, 0.081f, 1.013f, 0.8f, 1.468f, 1.259f)
                arcToRelative(3.172f, 3.172f, 0.0f, false, true, 0.782f, 1.349f)
                arcToRelative(3.171f, 3.171f, 0.0f, false, true, 4.238f, 2.9f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, true, 2.14f, 0.912f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.01f, 0.009f)
                arcToRelative(3.129f, 3.129f, 0.0f, false, true, 0.723f, 3.287f)
                arcToRelative(3.323f, 3.323f, 0.0f, false, true, 1.367f, 0.8f)
                curveToRelative(0.455f, 0.455f, 1.178f, 1.366f, 1.259f, 1.468f)
                close()
                moveTo(16.993f, 8.417f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-5.521f, 5.521f)
                lineToRelative(0.9f, 0.9f)
                arcToRelative(47.25f, 47.25f, 0.0f, false, false, 6.279f, -4.763f)
                lineToRelative(0.214f, 0.213f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.214f, -0.214f)
                arcToRelative(1.182f, 1.182f, 0.0f, false, false, 0.01f, -1.665f)
                arcTo(1.213f, 1.213f, 0.0f, false, false, 16.993f, 8.421f)
                close()
                moveTo(6.893f, 9.36f)
                lineTo(7.693f, 10.16f)
                arcTo(55.092f, 55.092f, 0.0f, false, true, 11.5f, 4.991f)
                lineTo(11.5f, 4.985f)
                arcToRelative(1.265f, 1.265f, 0.0f, false, false, -0.01f, -1.744f)
                curveToRelative(-0.14f, -0.141f, -0.363f, -0.336f, -0.589f, -0.527f)
                arcTo(21.32f, 21.32f, 0.0f, false, false, 6.893f, 9.364f)
                close()
                moveTo(10.058f, 12.524f)
                lineTo(15.582f, 7.0f)
                arcTo(1.185f, 1.185f, 0.0f, false, false, 13.9f, 5.332f)
                horizontalLineToRelative(0.0f)
                arcTo(47.426f, 47.426f, 0.0f, false, false, 9.139f, 11.61f)
                close()
                moveTo(21.286f, 13.098f)
                curveToRelative(-0.19f, -0.227f, -0.387f, -0.45f, -0.527f, -0.591f)
                arcToRelative(1.339f, 1.339f, 0.0f, false, false, -0.9f, -0.381f)
                arcToRelative(1.084f, 1.084f, 0.0f, false, false, -0.807f, 0.293f)
                arcToRelative(54.532f, 54.532f, 0.0f, false, true, -5.237f, 3.863f)
                lineToRelative(0.82f, 0.821f)
                arcTo(21.335f, 21.335f, 0.0f, false, false, 21.286f, 13.1f)
                close()
            }
        }
        .build()
        return _shuttlecock!!
    }

private var _shuttlecock: ImageVector? = null
