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

public val Icons.Outline.WagonCovered: ImageVector
    get() {
        if (_wagonCovered != null) {
            return _wagonCovered!!
        }
        _wagonCovered = Builder(name = "WagonCovered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.241f, 1.466f)
                arcTo(2.673f, 2.673f, 0.0f, false, false, 20.809f, 0.683f)
                lineToRelative(-0.395f, 0.079f)
                arcTo(12.161f, 12.161f, 0.0f, false, true, 19.0f, 1.0f)
                arcTo(8.032f, 8.032f, 0.0f, false, true, 16.431f, 0.227f)
                lineTo(15.991f, 0.02f)
                lineToRelative(-0.435f, 0.214f)
                arcTo(9.391f, 9.391f, 0.0f, false, true, 12.0f, 1.128f)
                arcToRelative(9.363f, 9.363f, 0.0f, false, true, -3.555f, -0.9f)
                lineTo(8.01f, 0.017f)
                lineTo(7.572f, 0.225f)
                arcTo(8.013f, 8.013f, 0.0f, false, true, 5.0f, 1.0f)
                arcTo(12.14f, 12.14f, 0.0f, false, true, 3.589f, 0.762f)
                lineToRelative(-0.4f, -0.08f)
                arcToRelative(2.676f, 2.676f, 0.0f, false, false, -2.431f, 0.784f)
                arcTo(2.713f, 2.713f, 0.0f, false, false, 0.068f, 3.949f)
                lineTo(2.0f, 13.105f)
                lineTo(2.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.86f, 21.0f)
                horizontalLineToRelative(4.284f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 20.0f)
                lineTo(22.0f, 13.105f)
                lineToRelative(1.929f, -9.138f)
                arcTo(2.719f, 2.719f, 0.0f, false, false, 23.241f, 1.466f)
                close()
                moveTo(2.205f, 2.851f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, true, 0.62f, -0.2f)
                lineToRelative(0.36f, 0.074f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 7.0f, 2.6f)
                lineTo(7.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 2.6f)
                arcToRelative(9.213f, 9.213f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 2.6f)
                arcToRelative(5.809f, 5.809f, 0.0f, false, false, 3.816f, 0.118f)
                lineToRelative(0.36f, -0.073f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, true, 0.62f, 0.2f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, 0.18f, 0.684f)
                lineTo(20.191f, 12.0f)
                lineTo(3.813f, 12.0f)
                lineTo(2.021f, 3.518f)
                arcTo(0.72f, 0.72f, 0.0f, false, true, 2.205f, 2.851f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 22.0f)
                close()
                moveTo(14.142f, 19.0f)
                lineTo(9.86f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 16.556f)
                lineTo(4.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(2.556f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.144f, 19.0f)
                close()
                moveTo(18.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _wagonCovered!!
    }

private var _wagonCovered: ImageVector? = null
